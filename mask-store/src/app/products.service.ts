import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Product } from './model';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  HOST = 'localhost:8080/'
  constructor(private httpClient: HttpClient) { }

  getProducts() {
    return this.httpClient.get<Product[]>(this.HOST+'getProducts');
  }


}
