# Swag Labs Testing

This repository contains automated test cases for the Sauce Labs website, using Katalon Studio. The test cases include scenarios for logging in, adding items to the cart, and completing a purchase.

## Prerequisites

- Katalon Studio installed on your machine.
- Access to the Sauce Labs website for testing.

## Test Cases

### 1. Valid Login

**Description:** Test login functionality with valid credentials.

**Steps:**
1. Open the browser and navigate to `https://www.saucedemo.com/v1/index.html`.
2. Enter username: `standard_user`.
3. Enter password: `qcu24s4901FyWDTwXGr6XA==` (encrypted text).
4. Click the login button.

**Expected Result:**
- User should be successfully logged in and redirected to the inventory page.

### 2. Invalid Login

**Description:** Test login functionality with invalid credentials.

**Steps:**
1. Open the browser and navigate to `https://www.saucedemo.com/v1/index.html`.
2. Enter username: `invalid_user`.
3. Enter password: `YylcEXeB4BUiM+Mf0KwtyAvnqJQr+1n1` (encrypted text).
4. Click the login button.

**Expected Result:**
- User should see an error message indicating invalid login credentials.

### 3. Add Item to Cart and Checkout

**Description:** Test adding an item to the cart and completing the purchase process.

**Steps:**
1. Open the browser and navigate to `https://www.saucedemo.com/v1/inventory.html`.
2. Click on the "Sauce Labs Backpack" item.
3. Click the "ADD TO CART" button.
4. Click the shopping cart icon to view the cart.
5. Wait for the checkout button to be visible and click it.
6. Enter first name: `john`.
7. Enter last name: `doe`.
8. Enter postal code: `12345`.
9. Click the "Continue" button.
10. Wait for the finish button to be visible and click it.

**Expected Result:**
- The item should be successfully added to the cart, and the purchase should be completed with the user redirected to a confirmation page.
