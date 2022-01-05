package de.mameie.backend.webdav;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import de.mameie.backend.rest.controller.REST;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebDavService implements REST<String> {

    private Sardine sardine;

    public WebDavService() {
        sardine = SardineFactory.begin();
        sardine.setCredentials(WebDavSettings.webDavUser, WebDavSettings.webDavPassword);
    }

    @Override
    public void delete(Long id) throws IOException {
        if (sardine.exists(WebDavSettings.webDavURL)) {

        }
        sardine.delete(WebDavSettings.webDavURL);
    }

    @Override
    public String get(Long id) throws IOException {
        if (sardine.exists(WebDavSettings.webDavURL)) {

        }
        InputStream is = sardine.get(WebDavSettings.webDavURL);
        return null;
    }

    @Override
    public List<String> getAll() throws IOException {
        List<String> dataList = new ArrayList<>();
        if (sardine.exists(WebDavSettings.webDavURL)) {
            List<DavResource> resources = sardine.list(WebDavSettings.webDavURL);
            for (DavResource res : resources) {
                dataList.add(res.toString());
            }
        }
        return dataList;
    }

    @Override
    public void put(String object) throws IOException {
        if (sardine.exists(WebDavSettings.webDavURL)) {
            sardine.delete(WebDavSettings.webDavURL);
            InputStream fis = new FileInputStream(new File("C:\\Users\\Markus\\Desktop\\mameiOptimizer\\backend\\src\\main\\java\\de\\mameie\\backend\\webdav\\temp\\dummyFile.txt"));
            sardine.put(WebDavSettings.webDavURL + "nameOfFile.txt", fis);
        }
    }

    @Override
    public void post(String object) throws IOException {
        if (sardine.exists(WebDavSettings.webDavURL)) {
            InputStream fis = new FileInputStream(new File("C:\\Users\\Markus\\Desktop\\mameiOptimizer\\backend\\src\\main\\java\\de\\mameie\\backend\\webdav\\temp\\dummyFile.txt"));
            sardine.put(WebDavSettings.webDavURL + "nameOfFile.txt", fis);
        }
    }
}
