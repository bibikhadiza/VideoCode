package oobasics.oobasics.bank

/**
  * Created by bibikhadiza on 7/5/17.
  */
class Account(customer: Customer, val id: String) {
  private var _balance = 0

  def balance = _balance

  def deposit(amount: Int): Boolean = {
    if(amount < 0) false
    else {
      _balance += amount
      true
    }
  }

  def withdrawl(amount: Int): Boolean = {
    if(amount < 0 || amount > _balance) false
    else {
      _balance -= amount
      true
    }
  }

  /*In the above source code we are constructing a class account
  class account has many customer and had an id
  an account object can only be instantiated given an id and a customer
  If we have available private for public var and val within our class, those values and variables are that are optional and does not need to
    be required inorder to instantiate an account object.

  */

  /* Private variables can be accessed outside of the class scope
  but not changed. */

  /* The functions deposit and withdrawl are instant methods that check conditions
  and based on the conditions either reduce or add to the balance */





}
