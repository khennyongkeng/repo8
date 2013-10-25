package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {
	public static void main(String[] args) throws
	ParseException {
		Student s = new Student();
		s.setNim("12101011");
		s.setNama("Dadang Iswanto");
		s.setAlamat("Jl. Taman bunga no. 2");
		s.setTglLahir(new SimpleDateFormat("dd-MM-YYYY"). parse
		("20-06-1990"));
		s.setNoHp("081122334455");
		
		Employee e = new Employee();
		e.setNip("21100989");
		e.setNama("Adi Sulistiono");
		e.setAlamat("Jl.Asem Jajar no.6");
		e.setTglLahir(new SimpleDateFormat("dd-MM-YYYY"). parse
		("13-06-1986"));
		e.setNoHp("081122334455");
		
		showData(s);
		System.out.println("\n=====================\n");
		showData(e);
		}
		static void showData(Student s){
			System.out.println("class student");
			System.out.println("NIM : " + s.getNim());
			System.out.println("Nama : " + s.getNama());
			System.out.println("Alamat : " + s.getAlamat());
			System.out.println("tgl Lahir : " + new SimpleDateFormat("dd-MM-YYYY").format(s.getTglLahir()));
			System.out.println("No Hp : " + s.getNoHp());
		}
		
		
		static void showData(Employee e){
			System.out.println("class Employee");
			System.out.println("NIP : " + e.getNip());
			System.out.println("Nama : " + e.getNama());
			System.out.println("Alamat : " + e.getAlamat());
			System.out.println("tgl Lahir : " + new SimpleDateFormat("dd-MM-YYYY").format(e.getTglLahir()));
			System.out.println("No Hp : " + e.getNoHp());
			}
	}