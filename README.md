# Loan Processing System

A Spring Boot backend service for managing loan applications, inspired by enterprise banking workflows.

## Features
- Create loan applications
- View all loan applications
- View a loan by ID
- Update loan status from PENDING to APPROVED

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

### Create Loan
`POST /api/loans`

### Get All Loans
`GET /api/loans`

### Get Loan By ID
`GET /api/loans/{id}`

### Update Loan Status
`PUT /api/loans/{id}/status?status=APPROVED`

## Sample Request
```json
{
  "customerName": "Sohith",
  "loanType": "HOME",
  "loanAmount": 200000
}