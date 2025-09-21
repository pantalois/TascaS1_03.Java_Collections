package level_1.exercici_1.app;

import level_1.exercici_1.Model.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
	public List<Month> getMonthsList() {
	ArrayList<Month> months = new ArrayList<>();
	months.add(new Month("January"));
	months.add(new Month("February"));
	months.add(new Month("March"));
	months.add(new Month("April"));
	months.add(new Month("May"));
	months.add(new Month("June"));
	months.add(new Month("July"));
	months.add(new Month("September"));
	months.add(new Month("October"));
	months.add(new Month("November"));
	months.add(new Month("December"));
	months.add(7, new Month("August"));
	return months;
	}

	public Set<Month> getMonthsSet() {
		return new HashSet<>(getMonthsList());
	}
}
