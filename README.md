# Messaging app
# SteelBall – User Registration & Login Validation
SeelBall is the name I gave the app. 
Like it?

**Author:** ST10487418 SIBONISO JONATHAN NGUBANE
**Last Updated:** 19 September 2025  

---

## 📋 Project Overview  

SteelBall is a Java console application created between **10 September and 19 September 2025** for practicing user registration and login validation as part of Part 1's POE. 

It demonstrates how to:  

- Validate a username  
- Validate password complexity  
- Validate South African cell phone numbers  
- Register and store a user’s credentials  
- Log in using stored credentials  
- Return clear status messages  
- Run automated tests using JUnit 5  

---

## 🗂 Project Structure
## Steelball
- SteelBall.java // Main program entry point
- Conditions.java // Core validation & login logic
- ConditionsTest.java // JUnit 5 unit tests
- README.md // Your on this file!!

## 🧩 Methods in Conditions.java  

| Method Name | Description |
|-------------|-------------|
| `boolean checkUserName(String username)` | Validates that username contains an underscore `_` and is at most 5 characters long. |
| `boolean checkPasswordComplexity(String password)` | Validates password contains at least 8 chars, one uppercase, one number, one special char. |
| `boolean checkCellPhoneNumber(String phone)` | Validates South African numbers starting with `0` (local) or `+27` (international). |
| `String registerUser(String username, String password, String cell)` | Checks all validations and stores the user if valid. |
| `boolean loginUser(String username, String password)` | Checks if login credentials match the stored ones. |
| `String returnLoginStatus(String username, String password)` | Returns the status message for login success or failure. |

## 📅 Project Timeline Snapshot  

- **10 September 2025** – Initialized repository and wrote basic structure.  
- **12 September 2025** – Added password complexity validation.  
- **15 September 2025** – Added login and return login status methods.  
- **17 September 2025** – Added unit tests.  
- **19 September 2025** – Final review and README created.

## 🔗 Reference list

- 
