import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-expense',
  templateUrl: './expense.component.html',
  styleUrls: ['./expense.component.css']
})
export class ExpenseComponent implements OnInit {
  formSubmitted=false;

  constructor() { }

  ngOnInit(): void {
  }

  
onExpense(expenseType:string,amount:number,date:string,comments:string){
  console.log('Expense Invoked');
  console.log(expenseType);
  console.log(amount);
  console.log(date);
  console.log(comments);
  this.formSubmitted=true;
  
}
}
