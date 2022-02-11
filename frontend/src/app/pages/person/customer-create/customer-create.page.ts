import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../models/Customer';
import {CustomerService} from '../../../services/http/customer.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.page.html',
  styleUrls: ['./customer-create.page.scss'],
})
export class CustomerCreatePage implements OnInit {
  newCustomer: Customer;

  constructor(private customerService: CustomerService, private route: Router) {
  }

  ngOnInit() {
    this.newCustomer = new Customer();
  }

  resetNewCustomer() {
    this.newCustomer = new Customer();
  }

  saveCustomer() {
    this.customerService.saveCustomer(this.newCustomer);
    this.route.navigate(['customer']);
  }
}
