
import java.util.*;


public class GestionTypes {

    private List<Type> listeTypesDeclares;
    private final List<Type> listeTypesDeBase;

    private List<ObjetDeclare> listeObjetsDeclares;

    public GestionTypes() {
        listeTypesDeclares = new ArrayList<Type>();
        listeTypesDeBase = new ArrayList<Type>();

        listeTypesDeBase.add(new Type("Object"));
        listeTypesDeBase.add(new Type("Character"));
        listeTypesDeBase.add(new Type("Vehicle"));
        listeTypesDeBase.add(new Type("Plane"));
        listeTypesDeBase.add(new Type("SpaceCraft"));
        listeTypesDeBase.add(new Type("Obstacle"));
        listeTypesDeBase.add(new Type("Weapon"));
        listeTypesDeBase.add(new Type("Sword"));
        listeTypesDeBase.add(new Type("Projectile"));
        listeTypesDeBase.add(new Type("Zone"));
        listeTypesDeBase.add(new Type("Ground"));
        listeTypesDeBase.add(new Type("Bonus"));
        listeTypesDeBase.add(new Type("CheckPoint"));
        listeTypesDeBase.add(new Type("Breakable"));
        listeTypesDeBase.add(new Type("Construction"));
        listeTypesDeBase.add(new Type("Room"));
        listeTypesDeBase.add(new Type("Ball"));
        listeTypesDeBase.add(new Type("Teleporter"));

    }

    public void ajouterType(String type) {
        
        listeTypesDeclares.add(new Type(type));
    }

    public boolean isTypeDeclare(String type) {
        for (int i = 0; i < listeTypesDeclares.size(); i++) {
            if (listeTypesDeclares.get(i).getNom().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeDeBase(String type) {
        for (int i = 0; i < listeTypesDeBase.size(); i++) {
            if (listeTypesDeBase.get(i).getNom().equals(type)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "Types de base :\n";
        for (int i = 0; i < listeTypesDeBase.size(); i++) {
            s += " "+listeTypesDeBase.get(i).getNom()+"\n";
        }

        s += "\nTypes hérités :\n";
        for (int i = 0; i < listeTypesDeclares.size(); i++) {
            s += " "+listeTypesDeclares.get(i).getNom()+"\n";
        }

        return s;
    }
}
