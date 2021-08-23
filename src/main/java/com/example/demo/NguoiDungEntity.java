package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NguoiDungEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column
		private String hoten;
		@Column
		private String email;
		@Column 
		private Long sdt;
		@Column
		private String noidung;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getHoten() {
			return hoten;
		}
		public void setHoten(String hoten) {
			this.hoten = hoten;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getSdt() {
			return sdt;
		}
		public void setSdt(Long sdt) {
			this.sdt = sdt;
		}
		public String getNoidung() {
			return noidung;
		}
		public void setNoidung(String noidung) {
			this.noidung = noidung;
		}
		
}
