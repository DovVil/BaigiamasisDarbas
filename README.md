# Auto testing  https://skytech.lt
![](https://www.skytech.lt/images/news/1(2).png)
✋ testng.xml is set up,make sure to edit thread count accordingly to your own system capabilities
---
### TS1 _Find GPU section using main menu button(HomeTest)_
###### TC: Find GPU section using main menu button
    Steps:
    1.Go to main website of the test
    2.Place mouse cursor over menu button "Kompiuteriai, Komponentai"
    and wait for it to expand
    3.Click on desired button ("Vaizdo plokštės ir priedai" in this case)
    4.Get directed to correct page ("Vaizdo plokštės")
**Expected result**: navigate to gpu section
<br>
**Status**: 🟩 PASS
---
### TS2 Find RTX 4090 GPU using main menu searchbar(HomeSearchBarTest)
###### TC: Find RTX 4090 GPU using main menu searchbar
    Steps:
    1.Go to main website of the test
    2.Click on search bar
    3.Enter "RTX 4090"
    4.Click on search button
    5.Find listing of RTX 4090 GPU
**Expected result**: find RTX 4090 GPU using searchbar
<br>
**Status**: 🟩 PASS
---
### TS3 Login using correct information and logout(LogInOutTest)
###### TC: Login using correct information and logout
    Steps:
    1.Go to website's login page
    2.Click on email field("El. pašto adresas") and enter email
    3.Click on password ("Slaptažodis") field and enter password
    4.Click on login ("Prisijungti") button
    5.Check if login was successful by seeing personal information
    6.Click on logout ("Atsijungti") button in dropdown menu "Mano paskyra"
    7.Check if login ("Prisijungti") button is available
**Expected result**: login to account using valid information and then logout
<br>
**Status**: 🟩 PASS
---
### TS4 Sorting GPU listings by price from high to low(SortByPriceTest)
###### TC: Sorting GPU listings by price from high to low
    Steps:
    1.Go to website's gpu listings page
    2.Mouseover sort (Rūšiuoti") menu
    3.Click on high to low price ("Kaina 100-1")
    4.Compare first and second listing price expecting first to be more expensive
**Expected result**: GPU's are sorted by price from high to low
<br>
**Status**: 🟩 PASS
---
### TS5 Add desired product to shopping cart and remove it(ShoppingCartTest)
###### TC: Add desired product to shopping cart and remove it
    Steps:
    1.Check if product is in stock ("Sandėlyje > 0")
    2.Click button to add product to shopping cart
    3.Enter shopping cart by clicking "Krepšelyje yra..." element
    4.See product listing inside shopping cart
    5.Click on shopping cart symbol "X" to remove product from the list
    6.See empty cart    
**Expected result**: Able to add and remove product within shopping cart
<br>
**Status**: 🟩 PASS
