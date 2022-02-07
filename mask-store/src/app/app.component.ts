import { Component } from '@angular/core';
import { Product } from './model';
import { ProductsService } from './products.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'mask-store';
  error = '';
  products: Product[] = [];

  constructor(private productService: ProductsService) {
    this.getProducts();
  }

  getProducts() {
    this.productService.getProducts().subscribe(list => { this.products = list; }, err => { this.error = err.message; });
  }

}
