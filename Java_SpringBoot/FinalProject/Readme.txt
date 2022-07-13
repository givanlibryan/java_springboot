------------------------------------------
Nama 			: Givan Kusuma Libryano
Kode Peserta 	: JVSB001ONL002
Link github		: https://github.com/givanlibryan/java_springboot/tree/main/Java_SpringBoot/FinalProject
------------------------------------------

Final Project
=============

>> Introduction
The Admin user can access this application on browser (laptop or mobile/tablet, doesn’t really matter as this is 
built using bootstrap, material design and is completely responsive) and can perform the following actions :
	1. Signup
	2. Login (and get a JWT token)
	3. List all available stops
	4. Search a trip between any two stops
	5. Filter search results with a date option
	6. Book a ticket for a given trip schedule

>> Database Schema
	1. The authentication and authorization is governed by User and Role collection.
	2. The Agency collection keeps the details of agency along with who owns it.
	3. The Stop collection keeps the data about all the stops in the system.
	4. The Bus collection has the data of all the buses for various agencies along with their capacity and make years.
	5. The Trip and TripSchedule collections keep the information about all the trips that agency owners create within the system. 
	   Information like source and destination stops, journey time, data of travel, tickets sold so far and the available seats is collected in them.
	6. The Ticket collection keeps information about all the tickets issued in the application for various trips.

>> Library/Tools Used
Following libraries were used during the development of this Final Project as your starter kit :
	1. Spring Boot : Server side framework
	2. MySQL : mySQL database
	3. JWT : Authentication mechanism for REST APIs
	4. Thymeleaf : Templating Engine
	5. Material : UI Themeing / design
	6. Bootstrap : CSS Frameworks
	7. JWT :  Authentication mechanism for REST APIs
	8. Spring version : 2.4.6
	9. Java version : 1.8

>> Berikut file yang ada dalam project:
=> com.givan.spring
	> FinalProjectBusApplication.java	(Run application serta load controller dan api)
=> com.givan.spring.config
	> FlywayConfiguration.java 		(Mengkonfigurasi flyway)
=> com.givan.spring.controller
	> AgenncyController.java 		(Create, read, update dan delete agency)
	> AuthController.java 			(Autentikasi dengan menggunakan jwt)
	> BusController.java			(Menambahkan dan mendapatkan data  bus)
	> StopController.java			(Menambahkan dan mendapatkan data pemberhentian)
	> TicketController.java			(Menambahkan, mendapatkan dan hapus data tiket)
	> TripController.java			(Menambahkan, mendapatkan dan hapus data perjalanan)
	> TripScheduleController.java		(Menambahkan, mendapatkan dan hapus serta merubah data jadwal perjalanan)
	> UserController.java 			(Sign up, rubah password dan mengedit data user)
=> com.givan.spring.model
	> Agency.java 				(Deklarasi serta getter dan setter agency)
	> Bus.java 					(Deklarasi serta getter dan setter bus)
	> ERole.java 				(Jenis role)
	> Role.java 				(Deklarasi serta getter dan setter role)
	> Stop.java 				((Deklarasi serta getter dan setter stop)
	> Ticket.java 				(Deklarasi serta getter dan setter ticket)
	> Trip.java 				(Deklarasi serta getter dan setter trip)
	> TripSchedule.java 			(Deklarasi serta getter dan setter jadwal trip)
	> User.java
=> com.givan.spring.payload.request
	> AgencyRequest.java			(Deklarasi serta getter dan setter AgencyRequest)
	> BusCustomRequest.java			(Deklarasi serta getter dan setter BusCustomRequest)
	> BusRequest.java				(Deklarasi serta getter dan setter BusRequest)
	> GetTripByStopRequest.java		(Deklarasi serta getter dan setter GetTripByStopRequest)
	> GetTripScheduleRequest.java		(Deklarasi serta getter dan setter GetTripScheduleRequest)
	> LoginRequest.java			(Deklarasi serta getter dan setter LoginRequest)
	> SignupCustomRequest.java		(Deklarasi serta getter dan setter SignupCustomRequest)
	> SignupRquest.java			(Deklarasi serta getter dan setter SignupRquest)
	> TicketRequest.java			(Deklarasi serta getter dan setter TicketRequest)
	> TripRequest.java			(Deklarasi serta getter dan setter TripRequest)
	> UserCustomRequest.java		(Deklarasi serta getter dan setter UserCustomRequest)
	> UserPasswordRequest.java		(Deklarasi serta getter dan setter UserPasswordRequest)
=> com.givan.spring.payload.response
	> JwtResponse.java			(Deklarasi serta getter dan setter JwtResponse)
	> MessageResponse.java			(Deklarasi serta getter dan setter MessageResponse)
=> com.givan.spring.repository
	> AgencyRepository.java			(Interface AgencyRepository dari extends JpaRepository)
	> BusRepository.java			(Interface BusRepository dari extends JpaRepository)
	> RoleRepository.java			(Interface RoleRepository dari extends JpaRepository)
	> StopRepository.java			(Interface StopRepository dari extends JpaRepository)
	> TicketRepository.java			(Interface TicketRepository dari extends JpaRepository)
	> TripRepository.java			(Interface TripRepository dari extends JpaRepository)
	> TripScheduleRepository.java		(Interface TripScheduleRepository dari extends JpaRepository)
	> UserRepository.java			(Interface UserRepository dari extends JpaRepository)
=> com.givan.spring.security
	> WebSecurityConfig.java		(Konfigurasi security web guna autentikasi user)
=> com.givan.spring.security.jwt
	> AuthEntryPointJwt.java		(AuthEntryPointJwt yang meng implements AuthenticationEntryPoint)
	> AuthTokenFilter.java			(AuthTokenFilter dari extends OncePerRequestFilter)
	> JwtUtils.java				(Utility JWT yang gunanya generate dan validate jwt token) 
=> com.givan.spring.security.services
	> UserDetailsImpl.java			(Security service untuk sign up user)
	> UserDetailsServiceImpl.java		(Checking user to UserRepository)

>> Akses Final Project
	http://localhost:8181/swagger-ui.html