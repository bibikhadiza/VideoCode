package oobasics.oobasics.bank

/**
  * Created by bibikhadiza on 7/5/17.
  */
class Customer(val firstName: String,
               val lastName: String,
               val id: Int,
               private var _address: Address
              ){

  private var accounts = List[Account]
}


//Singleton objects cannot be instatitated

