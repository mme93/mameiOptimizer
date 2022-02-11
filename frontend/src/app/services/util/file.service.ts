import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class FileService {

  constructor() { }

  fileExist(path: string){
    return false;
  }
}
