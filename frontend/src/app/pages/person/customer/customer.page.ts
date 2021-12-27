import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../models/Customer';
import {CustomerService} from '../../../services/http/customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.page.html',
  styleUrls: ['./customer.page.scss'],
})
export class CustomerPage implements OnInit {
  isPrivate = false;
  showNewMember = false;
  showMember = false;
  customer: Customer[] = [];
  newCustomer: Customer;
  processCustomer: Customer;

  constructor(private customerService: CustomerService) {
  }

  ngOnInit() {
    this.processCustomer = new Customer();
    this.newCustomer = new Customer();
    this.loadAllCustomer();
  }

  loadAllCustomer() {
    this.customer = [];
    this.customerService.getAllCustomer().forEach(value => {
      value.forEach(customer => {
        this.customer.push(customer);
      });
    });
  }

  resetNewCustomer() {
    this.newCustomer = new Customer();
  }

  deleteProcessCustomer() {
    this.customerService.deleteCustomer(this.processCustomer.email);
    this.showMember = false;
    this.customer.forEach((customer, index) => {
      if (customer === this.processCustomer) {
        this.customer.splice(index, 1);
      }
    });
    this.processCustomer = new Customer();
  }

  saveProcessCustomer() {
    this.customerService.updateCustomer(this.processCustomer);
  }

  saveCustomer() {
    this.customerService.saveCustomer(this.newCustomer);
    this.newCustomer = new Customer();
    this.customer.push(this.newCustomer);
  }

  loadCustomerProcess(customer: Customer) {
    this.showMember = true;
    this.processCustomer = customer;
  }

  changeNewMemberView() {
    this.showNewMember = !this.showNewMember;
  }

  changeMemberView() {
    this.showMember = !this.showMember;
  }

}
