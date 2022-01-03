import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Customer} from '../../../models/Customer';
import {CustomerService} from '../../../services/http/customer.service';

@Component({
  selector: 'app-customer-view',
  templateUrl: './customer-view.page.html',
  styleUrls: ['./customer-view.page.scss'],
})
export class CustomerViewPage implements OnInit {

  customer: Customer = new Customer();

  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService) {
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(params => {
      this.customerService.getCustomer({...params.keys, ...params}).subscribe(resultCustomer => {
        this.customer = resultCustomer;
      });
    });

  }
}
