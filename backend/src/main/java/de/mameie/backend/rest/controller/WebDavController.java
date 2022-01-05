package de.mameie.backend.rest.controller;

import de.mameie.backend.webdav.WebDavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/webdav")
public class WebDavController {

    private final WebDavService webDavService;

    @Autowired
    public WebDavController(WebDavService webDavService) {
        this.webDavService = webDavService;
    }

    @GetMapping("/fileNames")
    public List<String> getAllFileName() throws IOException {
        return webDavService.getAll();
    }
    @PostMapping("/save")
    public void saveFile() throws IOException {
        webDavService.post("");
    }

}
