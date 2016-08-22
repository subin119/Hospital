
public class Hospital {

	public static void main(String[] args) {

		//주석 추가
		Doctor 정형외과의사 = new Doctor("아이패드", "망치");
		정형외과의사.setComputer("맥북 프로 레티나 13인치 하스웰");
		정형외과의사.setMedicalAppliance("톱");
		정형외과의사.inqury();
		정형외과의사.treatment();
		정형외과의사.writePrescription();
		
		String 의사의컴퓨터 = 정형외과의사.getComputer();
		String 의사의진료기구 = 정형외과의사.getMedicalAppliance();
		
		System.out.printf("의사의 컴퓨터는 %s 입니다. \n", 의사의컴퓨터);
		System.out.printf("의사의 진료기구는 %s 입니다. \n",의사의진료기구);

		Doctor 신경외과의사 = new Doctor("갤럭시탭", "MRI");
		신경외과의사.setComputer("서피스 프로4 i5 256GB");
		신경외과의사.setMedicalAppliance("주사기");
		신경외과의사.inqury();
		신경외과의사.treatment();
		신경외과의사.writePrescription();
	}
}
