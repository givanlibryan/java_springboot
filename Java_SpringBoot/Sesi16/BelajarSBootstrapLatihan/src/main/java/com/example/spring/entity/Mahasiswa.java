package com.example.spring.entity;

@Entity
@Data
public class Mahasiswa {
	@Old
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid",strategy = "uuid2")
	private String id;
	@NotNull
	@NotBlank
	@Column(unique = true)
	private string nim;
	@NotNull
	@NotBlank
	private String nama;
	private float ipk;
	@NotNull
	@NotBlank
	private String jurusan;

}
