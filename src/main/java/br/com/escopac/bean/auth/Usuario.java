package br.com.escopac.bean.auth;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Integer id;

    @Column
    @Email(message = "Add valid email")
    @NotEmpty(message = " an email")
    private String email;

    @Column
    @NotEmpty(message = "Add your name")
    private String password;

    @Column
    @NotEmpty(message = "Add your name")
    private String name;

    @Column
    @NotEmpty(message = "Add your last name")
    private String lastName;

    @Column
    private Integer active=1;

    @Column
    private boolean isLoacked=false;

    @Column
    private boolean isExpired=false;

    @Column
    private boolean isEnabled=true;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario")
    private Set<Role> role;


}
