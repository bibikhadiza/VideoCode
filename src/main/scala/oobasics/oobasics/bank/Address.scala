package oobasics.oobasics.bank

/**
  * Created by bibikhadiza on 7/5/17.
  */
class Address(val customer: Customer, val id: String) {
  private var _balance = 0

  def balance = _balance

  def withdraw(amount: Int): Boolean = {
    if(amount < 0 || amount > _balance) false
    else {
      balance -= amount
    }
  }

  def deposit(amount: Int): Boolean = {
    if(amount < 0) false
    else {
      balance += amount
      true
    }
  }







}
