package beans;
import composite.EmployeeComponent;

public class Employee implements Cloneable,EmployeeComponent {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String email;
    private String poste;
    private double salaire;
    private String département;
    private String dateEmbauche;
    private boolean actif;
    public Employee(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Employee(String nom) {
        this.nom = nom;
    }
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void work() {
        System.out.println(nom + " is working.");
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getPoste() {
        return poste;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getDepartement() {
        return département;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public boolean isActif() {
        return actif;
    }
    public static class Builder {
        private Employee employee;

        public Builder() {
            employee = new Employee();
        }

        public Builder withId(int id) {
            employee.id = id;
            return this;
        }

        public Builder withNom(String nom) {
            employee.nom = nom;
            return this;
        }

        public Builder withPrenom(String prenom) {
            employee.prenom = prenom;
            return this;
        }

        public Builder withAge(int age) {
            employee.age = age;
            return this;
        }

        public Builder withAdresse(String adresse) {
            employee.adresse = adresse;
            return this;
        }

        public Builder withEmail(String email) {
            employee.email = email;
            return this;
        }

        public Builder withPoste(String poste) {
            employee.poste = poste;
            return this;
        }

        public Builder withSalaire(double salaire) {
            employee.salaire = salaire;
            return this;
        }

        public Builder withDepartement(String département) {
            employee.département = département;
            return this;
        }

        public Builder withDateEmbauche(String dateEmbauche) {
            employee.dateEmbauche = dateEmbauche;
            return this;
        }

        public Builder withActif(boolean actif) {
            employee.actif = actif;
            return this;
        }

        public Employee build() {
            return employee;
        }
    }
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public EmployeeMemento saveToMemento() {
        return new EmployeeMemento(this);
    }
    public void restoreFromMemento(EmployeeMemento memento) {
        this.id = memento.getId();
        this.nom = memento.getNom();
        this.prenom = memento.getPrenom();
        this.age = memento.getAge();
        this.adresse = memento.getAdresse();
        this.email = memento.getEmail();
        this.poste = memento.getPoste();
        this.salaire = memento.getSalaire();
        this.département = memento.getDepartement();
        this.dateEmbauche = memento.getDateEmbauche();
        this.actif = memento.isActif();
    }
}
