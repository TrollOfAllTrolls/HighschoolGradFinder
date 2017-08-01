
public class GraduationFinder {

	public static void main(String[] args) {
		GraduationFinder gradFind = new GraduationFinder();
		Student[] students = { new Student("Adams", "Kyran", 2, 2009, 4), new Student("Faizi", "Kian", 2, 2009, 4),
				new Student("Gompf", "Neil", 10, 2009, 4), new Student("Zeng", "Stanton", 6, 2009, 4),
				new Student("Oviedo", "Daniel", 3, 2013, 4), new Student("Rosenbaum", "Maya", 8, 2013, 4),
				new Student("Rooney", "Kellen", 4, 2014, 4), new Student("Mahoney", "Michael", 12, 2014, 1),
				new Student("Cooper", "Ella", 1, 2015, 4), new Student("Gupta", "Arnav", 11, 2015, 4),
				new Student("McStravick", "Lochland", 11, 2015, 4), new Student("Shiah", "Eli", 8, 2015, 4),
				new Student("Morrin", "Cody", 7, 2009, 5), new Student("Fullepp", "Markopolo", 8, 2010, 5),
				new Student("Lewis", "Brandon", 3, 2010, 5), new Student("McKinnis", "Kevin", 9, 2010, 5),
				new Student("Sih", "Jennifer", 4, 2010, 5), new Student("Turner", "Daniel", 9, 2010, 5),
				new Student("Basu", "Dhruba", 2, 2012, 5), new Student("DeSantis", "Jennifer", 9, 2011, 5),
				new Student("Sun", "Patrick", 9, 2011, 5), new Student("Williams", "Luke", 9, 2011, 5),
				new Student("Alvarez", "Jake", 11, 2012, 5), new Student("Baxt", "Russell", 8, 2012, 5),
				new Student("Blue", "Miles", 8, 2012, 5), new Student("Sheres", "Benjamin", 7, 2012, 5),
				new Student("Siffert", "Alexander", 2, 2012, 5), new Student("St Armour", "Trevor", 1, 2012, 5),
				new Student("Sung", "Derek", 11, 2012, 5), new Student("Dysart", "Jimmy", 1, 2013, 5),
				new Student("Hudson", "Callan", 4, 2013, 5), new Student("Silverman", "Jake", 1, 2014, 5),
				new Student("Teague", "Caroline", 8, 2014, 5), new Student("Alvarez", "Sofia", 3, 2015, 5),
				new Student("Davidson", "Justin", 11, 2015, 5), new Student("Loam", "Ian", 11, 2015, 5),
				new Student("Tolley", "Ryan", 11, 2015, 5), new Student("Young", "Julia", 4, 2016, 5),
				new Student("Kyrillos", "Carl", 11, 2008, 6), new Student("Vergara", "Edgar", 8, 2009, 6),
				new Student("Espinoza", "Gustavo", 11, 2009, 6), new Student("Goskowicz", "Alex", 5, 2010, 6),
				new Student("Radovcic", "Phenomena", 8, 2010, 6), new Student("Shi", "Alexander", 5, 2010, 6),
				new Student("Simpson", "Jacob", 8, 2010, 6), new Student("Dykstra", "Theodore", 2, 2012, 6),
				new Student("Knowles", "Jonathan", 12, 2011, 6), new Student("Halperin", "Bernardo", 2, 2012, 6),
				new Student("McCloskey", "Conner", 1, 2012, 6), new Student("Muir", "Thomas", 6, 2012, 6),
				new Student("Pham", "Katrina", 11, 2012, 6), new Student("Vilela", "Nicolas", 9, 2012, 6),
				new Student("Beamer", "Andrew", 8, 2013, 6), new Student("Bentley", "Skye", 8, 2013, 6),
				new Student("Birnkrant", "Rachel", 7, 2013, 6), new Student("Boyle", "Sean", 7, 2013, 6),
				new Student("Hazuka", "Zoe", 8, 2013, 6), new Student("Heidari", "Shireen", 8, 2013, 6),
				new Student("Keeling", "Laila", 8, 2013, 6), new Student("Kramer", "Declan", 8, 2013, 6),
				new Student("Martin", "Christopher", 8, 2013, 6), new Student("Ainsworth", "Sarah", 4, 2014, 6),
				new Student("Fordham", "James", 8, 2014, 6), new Student("Gowda", "Sumukh", 11, 2014, 6),
				new Student("Hanson", "Ashley", 7, 2014, 6), new Student("Lucey", "Conner", 8, 2014, 6),
				new Student("Romine", "Teagan", 4, 2014, 6), new Student("Soe", "Zachary", 8, 2014, 6),
				new Student("Yuzdani", "Ehsun", 8, 2014, 6), new Student("Crotty", "Ella", 3, 2015, 6),
				new Student("Gonzalez", "Saudy", 3, 2015, 6), new Student("Moon", "Maxwell", 4, 2015, 6),
				new Student("Robke", "Ella", 3, 2015, 6), new Student("Rojas", "Jolie", 11, 2015, 6),
				new Student("Lau", "Esteban", 7, 2014, 6), new Student("Gulley", "Rahsaan", 9, 2008, 7),
				new Student("Ramirez", "Adrian", 8, 2009, 7), new Student("Zeng", "Aaron", 6, 2009, 7),
				new Student("Williams", "Jake", 9, 2010, 7), new Student("Cooper", "Christian", 8, 2011, 7),
				new Student("Feifel", "Eitan", 12, 2011, 7), new Student("Kempinski", "Nadav", 12, 2011, 7),
				new Student("Weiser", "Michael", 12, 2011, 7), new Student("Xie", "Allyson", 6, 2011, 7),
				new Student("Zhang", "Austin", 12, 2011, 7), new Student("Zhang", "Katie", 6, 2011, 7),
				new Student("Bailey", "Chad", 7, 2012, 7), new Student("Colban", "Andreas", 8, 2012, 7),
				new Student("Harrington", "Thomas", 9, 2010, 7), new Student("Hirai", "Kahn", 11, 2012, 7),
				new Student("Mazza", "Anthony", 7, 2012, 7), new Student("Ryan", "Ann", 1, 2012, 7),
				new Student("Soordelu", "Anvitha", 7, 2012, 7), new Student("Weaver", "Collin", 2, 2012, 7),
				new Student("Tremaine", "Andrew", 12, 2012, 1), new Student("Brown", "Joshua", 3, 2013, 7),
				new Student("Dobrawa", "Vincent", 7, 2013, 7), new Student("Ferguson", "Justin", 7, 2013, 7),
				new Student("Ferguson", "Sebastian", 7, 2013, 7), new Student("Kaushik", "Amogh", 7, 2013, 7),
				new Student("Reyes", "Sofia", 11, 2013, 7), new Student("Shah", "Kishan", 8, 2013, 7),
				new Student("Bacon", "William", 4, 2014, 7), new Student("Carnecchia", "Dante", 11, 2014, 7),
				new Student("Chang", "Kate", 8, 2014, 7), new Student("Chin", "Caroline", 8, 2014, 7),
				new Student("Dann", "Lucas", 4, 2014, 7), new Student("Khan", "Muhammad Yamaan", 7, 2014, 7),
				new Student("Laffitte", "Damya", 7, 2014, 7), new Student("Oh", "Peter", 7, 2014, 7),
				new Student("Tankersley", "Mark", 7, 2014, 7), new Student("Teague", "Leah", 8, 2014, 7),
				new Student("Garvey", "Beau", 8, 2015, 7), new Student("Ortega", "John", 7, 2015, 7),
				new Student("Puzio", "Esme", 3, 2015, 7), new Student("Chan", "TJ", 9, 2009, 8),
				new Student("Woodnutt", "Adam", 9, 2009, 8), new Student("Keefe", "Riley", 8, 2010, 8),
				new Student("Lau", "Darian", 3, 2010, 8), new Student("Sih", "Caroline", 4, 2010, 8),
				new Student("Chakraverti-Wuerthwein", "Pia", 12, 2011, 8),
				new Student("Glasser", "Joshua", 12, 2011, 8), new Student("Grossman-Thompson", "Ben", 11, 2012, 8),
				new Student("Macchio", "Gregory", 11, 2012, 8), new Student("Mittemeyer", "Jack", 8, 2012, 8),
				new Student("Poole", "Andrew", 6, 2009, 8), new Student("Takiff", "John", 9, 2012, 8),
				new Student("Avina", "Devin", 7, 2013, 8), new Student("Barber", "Nick", 4, 2013, 8),
				new Student("Boyle", "Andrew", 7, 2013, 8), new Student("Dorsey", "Ben", 7, 2013, 8),
				new Student("Keeling", "Adina", 8, 2013, 8), new Student("Leonard", "Edward", 8, 2013, 8),
				new Student("Shah", "Karishma", 8, 2013, 8), new Student("Vaughan", "Gage", 7, 2013, 8),
				new Student("Verdias", "Juan", 2, 2013, 8), new Student("Bentel", "Ethan", 7, 2014, 8),
				new Student("Dann", "David", 4, 2014, 8), new Student("Stein", "Nicole", 11, 2014, 8),
				new Student("Barber", "Kevin", 3, 2015, 8), new Student("Calderon", "David", 7, 2015, 8),
				new Student("Chang", "Joshua", 11, 2015, 8), new Student("Denissenko", "Julia", 7, 2015, 8),
				new Student("Nienstedt", "Johnny", 4, 2015, 8), new Student("Oregel", "Daniel", 7, 2015, 8),
				new Student("Roccoforte", "Anthony", 7, 2015, 8), new Student("Seriva", "Sydney", 3, 2015, 8),
				new Student("Young", "Cecilia", 1, 2016, 8), new Student("Lau", "Gabriela", 8, 2014, 8),
				new Student("Kota", "Meera", 12, 2011, 9), new Student("Aragon", "Jeovani", 8, 2012, 9),
				new Student("Iverson", "Austin", 1, 2012, 9), new Student("Cappetta", "Gabriel", 11, 2013, 9),
				new Student("Copic", "Emilia", 9, 2013, 9), new Student("Mikulak", "Hannah", 8, 2013, 9),
				new Student("Reyes", "Vivian", 6, 2016, 9), new Student("Hendren", "Noah", 7, 2014, 9),
				new Student("Brewer", "Eiden", 7, 2015, 9), new Student("Calderon", "Yadira", 7, 2015, 9),
				new Student("Foltz", "Benjamin", 4, 2015, 9), new Student("Jardel", "Jacklyn", 3, 2015, 9),
				new Student("Rao", "Rithvik", 4, 2015, 9), new Student("Scherdorf", "Cameron", 8, 2015, 9),
				new Student("Yaghouti", "Cameron", 8, 2015, 9), new Student("Shillman", "Barney", 12, 2010, 10),
				new Student("Coufal", "Frank H.", 4, 2011, 10), new Student("Giacalone", "Gianna", 1, 2012, 10),
				new Student("Caples", "Will", 7, 2013, 10), new Student("Clark", "Stephen", 2, 2013, 10),
				new Student("Lira", "Daniel", 7, 2014, 10), new Student("Simone", "Dominic", 4, 2014, 10),
				new Student("Clement", "Brooke", 4, 2015, 10), new Student("Li", "Aaron", 8, 2015, 10),
				new Student("McDonough", "Kelsey", 4, 2015, 10), new Student("Hoh", "Jodie", 12, 2015, 10),
				new Student("Ward", "Tyler", 7, 2009, 11), new Student("Yevchak", "Steven", 7, 2012, 11),
				new Student("Mateo", "Adonis", 3, 2014, 11), new Student("Medina", "Aaron", 11, 2015, 11),
				new Student("Wussler", "Bailey", 4, 2015, 11), new Student("Serna", "Claudio", 6, 2014, 11),
				new Student("Chakraverti-Wuerthwein", "Milena", 12, 2011, 12),
				new Student("Gomez", "Sergio", 6, 2013, 12), new Student("Dawit", "Phaniel", 6, 2014, 12),
				new Student("Lira", "Vanessa", 7, 2014, 12), new Student("Mateo", "Evelyn", 4, 2014, 12),
				new Student("Ruiz", "Paulina", 1, 2016, 12), new Student("Ibrahim", "Ali", 6, 2014, 100),
				new Student("Enriquez", "Pedro", 8, 2009, 100), new Student("Weiser", "Daniel", 12, 2011, 10),
				new Student("Bayley", "Charles", 7, 2012, 100), new Student("Ainsworth", "Mary", 4, 2014, 9),
				new Student("Rajgopal", "Nandini", 7, 2014, 4) };
		
		gradFind.calculate(students);
	}

	public void calculate(Student[] students) {
		int tempYear;
		int tempGrade;
		for (int i = 0; i < students.length; i++) {
			tempYear = students[i].getYStart();
			tempGrade = students[i].getGrade();
			if (students[i].getMStart() > 6) {
				tempYear++;
			}
			while (tempGrade < 12) {
				tempYear++;
				tempGrade++;
			}

			if (tempYear <= 2017 && tempGrade < 100) {
				System.out.println("[" + students[i].getLName() + ", " + students[i].getFName()
						+ "] graduated highschool in [" + tempYear + "].");
			} else if (tempGrade < 100) {
				System.out.println("[" + students[i].getLName() + ", " + students[i].getFName()
						+ "] will graduate highschool in [" + tempYear + "].");
			} else {
				System.out.println("[" + students[i].getLName() + ", " + students[i].getFName()
						+ "] was out of highschool when he signed up.");
			}
		}
	}
}
