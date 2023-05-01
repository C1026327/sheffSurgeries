package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    
    def surgery = new com.koutram.Surgery
    (
    	name: 'Sheffield Surgeries',
    	address: 'Sheffield',
    	postcode: 'S66 T3ST',
    	telephone: '07555 3556789',
    	numberOfPatients: 50,
    	openingTime: '7:00 AM - 11:00PM',
    	registeringNewPatients: true
    ).save(failOnError:true)
    
    def surgeryB = new com.koutram.Surgery
    (
    	name: 'Barnsley Surgeries',
    	address: 'Barnsley, Sheffield',
    	postcode: 'S60 T3ST',
    	telephone: '07523 3634589',
    	numberOfPatients: 30,
    	openingTime: '8:00 AM - 9:00PM',
    	registeringNewPatients: false
    ).save(failOnError:true)
    
    def doctor = new com.koutram.Doctor
    (
    	name: 'Dr Fallon',
    	email: 'DrFallon@gmail.com',
    	phoneNumber: '057644 34534523',
    	qualifications: 'MSChB',
    	position: 'Surgeon',
    	username: 'fallon',
    	password: 'password',
    	doctorOffice: 'S-678',
    	bio: 'Dr Fallon is a reknown Surgeon whom is most definitely capable of Surgery.',
    	surgery: surgery
    ).save(failOnError:true)
    
    def doctorB = new com.koutram.Doctor
    (
    	name: 'Dr Isabella Marion',
    	email: 'IMarion@gmail.com',
    	phoneNumber: '057644 34534523',
    	qualifications: 'MSChB',
    	position: 'GP, Surgeon',
    	username: 'isabella',
    	password: 'password',
    	doctorOffice: 'S-678',
    	bio: 'Tenebre Lorem Ipsum.',
    	surgery: surgeryB
    ).save(failOnError:true)
    
    def patient = new com.koutram.Patient
    (
    	name:'Jimmy',
    	phoneNumber: '01443 52349078',
    	patientAddress: 'Local Street, Sheffield',
    	patientResidence: '23 73 Apartment 2',
    	patientDob:'1999-04-11',
    	patientID:'J35200',
    	dateRegistered:'2018-03-06',
    	surgery:surgery
    ).save(failOnError:true)
    
    def patientB = new com.koutram.Patient
    (
    	name:'Tera',
    	phoneNumber: '07345 3456798',
    	patientAddress: 'Local Street, Sheffield',
    	patientResidence: '6543 Lot 7',
    	patientDob:'2002-07-06',
    	patientID:'T7564',
    	dateRegistered:'2012-04-11',
    	surgery:surgeryB
    ).save(failOnError:true)
    
    def receptionist = new com.koutram.Receptionist
    (
    	name:'Stafford Randy',
    	email:'StaffordRandy472@gmail.com',
    	phoneNumber: '07356 6534478',
    	username:'root',
    	password:'password',
    	surgery: surgery
    ).save(failOnError:true)
    
    def receptionistB = new com.koutram.Receptionist
    (
    	name:'Rosanne Wynona',
    	email:'RosanneWynona0451@hotmail.com',
    	phoneNumber: '07534 3465879',
    	username:'rosanne',
    	password:'password',
    	surgery: surgeryB
    ).save(failOnError:true)
    
    def nurse = new com.koutram.Nurse
    (
    	name: 'Milburn Cori',
    	email: 'MilburnC745b@gmail.com',
    	phoneNumber: '07634 465978',
    	qualifications: 'RNDA',
    	nurseOffice: 'N-354',
		username: 'milburn',
		password: 'password',
    	surgery: surgery
    ).save(failOnError:true)
    
    def nurseB = new com.koutram.Nurse
    (
    	name: 'Allen Grenville',
    	email: 'AllenG745b@hotmail.com',
    	phoneNumber: '07634 465978',
    	qualifications: 'RNDA',
    	nurseOffice: 'N-457',
		username: 'allen',
		password: 'password',
    	surgery: surgeryB
    ).save(failOnError:true)
    
    def appointment = new com.koutram.Appointment
    (
    	appDateTime: new Date(2020 - 1900, 4, 7, 8, 0, 0),
    	appDuration:30,
    	roomNumber: 'S-412',
    	surgery: surgery,
    	doctor: doctor,
    	patient: patient
    ).save(failOnError:true)
    
    def appointmentB = new com.koutram.Appointment
    (
    	appDateTime: new Date(2020 - 1900, 7, 4, 2, 0, 0),
    	appDuration:45,
    	roomNumber: 'S-324',
    	surgery: surgeryB,
    	doctor: doctorB,
    	patient: patientB
    ).save(failOnError:true)
    
    def prescription = new com.koutram.Prescription
    (
    	pharmacyName: 'Weldricks',
    	prescriptionNumber: 354,
    	medicine: 'Paracetamol',
    	daysSupply: 7,
    	totalCost:9.99,
    	dateIssued: new Date(2020 - 1900, 4, 8, 9, 0, 0),
    	patientPaying: false,
    	doctor: doctor,
    	patient: patient
    ).save(failOnError:true)
    
    def prescriptionB = new com.koutram.Prescription
    (
    	pharmacyName: 'Weldricks',
    	prescriptionNumber: 234,
    	medicine: 'Nurofen',
    	daysSupply: 14,
    	totalCost:4.99,
    	dateIssued: new Date(2020 - 1900, 4, 8, 9, 0, 0),
    	patientPaying: true,
    	doctor: doctorB,
    	patient: patientB
    ).save(failOnError:true)
    
    }
    def destroy = {
    }
}
