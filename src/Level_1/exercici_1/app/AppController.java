package level_1.exercici_1.app;

import level_1.exercici_1.Model.Month;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class AppController {
	public static void run() {
		Service service = new Service();
		List<Month> months = service.getMonthsList();

		System.out.println("ArrayList ordered with 'August' inserted:");
		for (Month m : months) {
			System.out.println(m.getMonthName());
		}

		Set<Month> monthSet = service.getMonthsSet();
		System.out.println("\nHashSet (does not allow duplicates):");
        monthSet.add(new Month("August"));
        monthSet.add(new Month("December"));
		for (Month m : monthSet) {
			System.out.println(m.getMonthName());
		}

		System.out.println("\nIterating with Iterator:");
		Iterator<Month> it = months.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getMonthName());
		}
	}
}
