package healthMgmt;
import java.util.*;

class NameComparator implements Comparator<Resident> {

    @Override
    public int compare(Resident o1, Resident o2) {

        return (o1.getFullName().compareTo(o2.getFullName()));
    }

}



public class ResidentService {
	private static List<Resident> residentsRepository = new ArrayList<>();

    public ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident) {
		if(resident==null){
			return false;
		}
		residentsRepository.add(resident);
        return true;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber){
		Iterator<Resident>itr= residentsRepository.iterator();
		while(itr.hasNext()) {
			Resident r= itr.next();
			if(r.getSSN()==socialSecurityNumber) {
				return r;
			}
		}
       	return null;

    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository){
    	ArrayList<Resident>al=new ArrayList<Resident>();
    	al.addAll(residentsRepository);
    	Collections.sort(al, new NameComparator());
    	return al;
    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){
    	List<Resident>ls=new ArrayList<>();
    	Iterator<Resident>itr= residentsRepository.iterator();
		while(itr.hasNext()) {
			Resident r= itr.next();
			if(r.getGender()==gender) {
				ls.add(r);
			}
		}


       return ls;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResidentService r= new ResidentService();
		Resident resident1 = new Resident("John" , 1111,'M');
        Resident resident2 = new Resident("Johnny",2222,'M');
        Resident resident3 = new Resident("Charles" ,3333,'F');
        Resident resident4 = new Resident("Harry",4444,'M');
        Resident resident5 = new Resident("William",5555,'M');
        
        r.addResident(resident1);
        r.addResident(resident2);
        r.addResident(resident3);
        r.addResident(resident4);
        r.addResident(resident5);
        
       System.out.println(r.getAllNamesSorted(residentsRepository));
//        }
        
        
        
        

	}

}
