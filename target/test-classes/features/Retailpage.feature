Feature: Tekschool Retail Page

Background:

Given User is on Retail website 
And User click  on MyAccount
When User click on Login 
And User enter username "ricardo072323@gmail.com" and password "ricardo" 
And User click on Login button
Then User should be logged in to MyAccount dashboard

@RegisterAffiliate
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|payeeName|
|myCompanyXYZ|www.abc.com|1234|Cheque|gorkem|
And User check on About us check box
And User click on Continue button
Then User should see a success message 

@EditAffiliate
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|WellsFargo|123456|789|myAccount|987654|
And User click on Continue button
Then User should see a success message

@EditAccount
Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|gorkem|gurbuz|abcdef@edft.com|12345678910|
And User click on Continue button 
Then User should see a message "Success: Your account has been successfully updated."
