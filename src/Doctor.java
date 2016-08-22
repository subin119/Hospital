/**
 * Doctor 클래스를 선언한다.
 * 
 * Doctor 클래스는 아래 기능을 수행한다.
 * 
 * 1.환자 조회 2.진료 3.처방전 작성
 * 
 * Doctor 클래스는 아래 두가지를 반드시 필요로 한다.
 * 
 * 1.컴퓨터 2.진료 기구
 * 
 * @author 206-019
 *
 */
public class Doctor {

	/**
	 * 의사가 환자를 조회하거나 처방전을 작성할 때 사용할 컴퓨터
	 */
	private String computer;

	/**
	 * 의사가 환자를 진료할 때 사용할 의료 기구
	 */
	private String medicalAppliance;

	/**
	 * Doctor클래스의 기본 생성자 만들지 않아도 상관없음
	 */
	Doctor() {

	}

	/**
	 * Doctor 클래스의 변형 생성자(오버로딩)
	 * 
	 * Doctor 클래스의 computer와 medicalAppliance 를 초기화 한다.
	 * 
	 * @param computer
	 * @param medicalApplaiance
	 */
	public Doctor(String computer, String medicalAppliance) {
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
	}

	public void setComputer(String computer) {
		this.computer = computer;
		
		System.out.println(this.computer + "로 바뀌었습니다.");
	}

	public String getComputer() {
		return computer;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
		
		System.out.println(this.medicalAppliance + "로 바뀌었습니다.");
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
	}

	/**
	 * 한자를 computer에서 조회함
	 */
	public void inqury() {
		/*
		 * printf는 출력될 문자열의 Format을 지정할 수 있다.
		 * 
		 * %d : 숫자(정수) %f : 숫자(실수) %s : 문자열(String)
		 * 
		 * println은 printLine의 약자 문자열을 출력하고 Enter를 친 것과 같이 표현한다.
		 * 
		 * printf는 printFormat의 약자 문자열을 출력하고 Enter를 친 것과 같은 표현을 하지 않는다. \n : 한줄을
		 * 띄어주는 Escape 명령어 \t : Tab을 누른것과 같이 표현하는 Escape 명령어 \" : 따음표를 문자열에 문자열에
		 * 추가시키는 Escape 명령어
		 */
		System.out.printf("%s에서 환자를 조회합니다.\n", computer);
	}

	/**
	 * 환자를 진료함
	 */
	public void treatment() {
		System.out.printf("%s로 환자를 진료합니다.\n", medicalAppliance);

		viewMouth();
		viewEars();
		viewNose();
	}

	private void viewMouth() {
		System.out.println("입안을 살피겠습니다.");
	}

	private void viewEars() {
		System.out.println("귀를 살피겠습니다.");
	}

	private void viewNose() {
		System.out.println("코를 살피겠습니다.");

	}

	/**
	 * 처방전을 작성함
	 */
	public void writePrescription() {
		System.out.printf("%s로 환자의 처방전을 작성합니다.\n", computer);
	}
}
