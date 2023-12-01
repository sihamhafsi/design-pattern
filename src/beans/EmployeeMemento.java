package beans;
public class EmployeeMemento {
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
    public EmployeeMemento(Employee employee) {
        this.id = employee.getId();
        this.nom = employee.getNom();
        this.prenom = employee.getPrenom();
        this.age = employee.getAge();
        this.adresse = employee.getAdresse();
        this.email = employee.getEmail();
        this.poste = employee.getPoste();
        this.salaire = employee.getSalaire();
        this.département = employee.getDepartement();
        this.dateEmbauche = employee.getDateEmbauche();
        this.actif = employee.isActif();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
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
}
