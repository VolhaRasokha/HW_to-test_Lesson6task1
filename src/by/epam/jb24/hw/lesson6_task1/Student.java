package by.epam.jb24.hw.lesson6_task1;

public class Student {
	String lastName;
	String firstName;
	int scoreMathematics;
	int scorePhysics;
	int scoreChemistry;
	int scoreBiology;

	public Student(String _firstName, String _lastName) {
		firstName = _firstName;
		lastName = _lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getScoreMathematics() {
		return scoreMathematics;
	}

	public void setScoreMathematics(int scoreMathematics) {
		this.scoreMathematics = scoreMathematics;
	}

	public int getScorePhysics() {
		return scorePhysics;
	}

	public void setScorePhysics(int scorePhysics) {
		this.scorePhysics = scorePhysics;
	}

	public int getChemistry() {
		return scoreChemistry;
	}

	public void setScoreChemistry(int scoreChemistry) {
		this.scoreChemistry = scoreChemistry;
	}

	public int getBiology() {
		return scoreBiology;
	}

	public void setScoreBiology(int scoreBiology) {
		this.scoreBiology = scoreBiology;
	}

	public double averageStudentScore() {
		double averageStudentScore = 0;
		double count = 0;

		if (!(this.scoreChemistry == 0)) {
			count = count + 1;
		}

		if (!(this.scoreBiology == 0)) {
			count = count + 1;
		}

		if (!(this.scorePhysics == 0)) {
			count = count + 1;
		}

		if (!(this.scoreMathematics == 0)) {
			count = count + 1;
		}

		averageStudentScore = (this.scoreChemistry + this.scoreBiology
				+ this.scoreMathematics + this.scorePhysics)
				/ count;
		return averageStudentScore;
	}

	public boolean toFindBadStudent() {
		boolean badScore = false;

		if (this.scoreChemistry == 2) {
			badScore = true;
			return badScore;
		}

		if (this.scoreBiology == 2) {
			badScore = true;
			return badScore;
		}

		if (this.scorePhysics == 2) {
			badScore = true;
			return badScore;
		}

		if (this.scoreMathematics == 2) {
			badScore = true;
			return badScore;
		}

		return badScore;
	}

}
