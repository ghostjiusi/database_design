import DAOConcrete.*;
import DAOinterface.*;
import Entity.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scinterface s = DAOFactory.getSc();
		Sc sc = new Sc();
		sc.setCno("S111");
		sc.setCnam("Î¢»ú");
		sc.setCsou(5.0);
		sc.setCnum(20);
		sc.setCt("°¬Ã×");
		s.updata(sc);
		
	}

}
