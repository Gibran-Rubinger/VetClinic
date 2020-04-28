package animals;

public abstract class Animals {

//  attributes
	 protected int idAnimal= 0;
	 protected String name = null;
	 protected int age= 0;
	 protected String species = null;
	 protected String gender = null;
	 protected String medicalCond = null;
	 
	 
//	constructor
	public Animals() {
	}
//	constructor to set the Attributes.
	public Animals(int idAnimal, String name, int age,String species, String gender, String medicalCond) {
		this.idAnimal = idAnimal;
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.medicalCond = medicalCond;	
	}
	
//	produce the methods for getters and setters.
		public int getIdAnimal() {
			return idAnimal;
		}
		public void setIdAnimal(int idAnimal) {
			this.idAnimal = idAnimal;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMedicalCond() {
			return medicalCond;
		}
		public void setMedicalCond(String medicalCond) {
			this.medicalCond = medicalCond;
		}
//		define the hash and equals.
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + idAnimal;
			result = prime * result + ((medicalCond == null) ? 0 : medicalCond.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((species == null) ? 0 : species.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animals other = (Animals) obj;
			if (age != other.age)
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (idAnimal != other.idAnimal)
				return false;
			if (medicalCond == null) {
				if (other.medicalCond != null)
					return false;
			} else if (!medicalCond.equals(other.medicalCond))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (species == null) {
				if (other.species != null)
					return false;
			} else if (!species.equals(other.species))
				return false;
			return true;
		}
				// creating the to String to override it.
				@Override
				public String toString() {
					return "ID: " +idAnimal+ "   Name: " + name + "         Age: " + age+ "         Specie: " + species+"       Gender: " + gender+ "   \n \n Medical Condition: " + medicalCond+ ". \n\n"+"\n________________________________________________________________________________________________________________________________________________________";
				}
}

