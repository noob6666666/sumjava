
class Main {

	public static void main(String[] args) {
    	(new Main()).init(12,44);
	}

	double gpa(double gpa){
		if(gpa>90){
			return gpa*1.1;
		} else{
			return gpa;
		}
	}
	boolean isGraduating(double gradelevel, double credits){
		if(gradelevel==12&&credits>=44){
			return true;
		} else {
			return false;
		}
	}

	void init(double gradelevel, double credits){
		if(gradelevel==12&&credits>=44){
			System.out.println("Student is Graduating");
		} else {
			System.out.println("Student is NOT Graduating");
		}
	double BMI(double hight, double weight){
		double bmi = (weight/(Math.square(hight,2)))*703.0
		if(bmi<18.4){
			return Underweight;
		} else if(bmi>=18.5&&bmi<=24.9){
			return Normal
		} else if(bmi>=25.0&&bmi<=39.9){
			return Overweight
		}else if(bmi>40.0){
			return Obese
		}
	}
	}
   double shippingCost(double weight){
	if(wieght<=10){
		return 0
	} else if(weight>10&&weight<=15){
		return 5
	}else if(weight>15&&weight<=25){
		return 5
	}else if(weight>25){
		return weight+((weight-25)*0.02)
	}
   }

	boolean blueOrViolet(double hz){
		if(hz>=600&&hz<=670){
			return true blue
		} else if(hz>=700&&hz<=750){
			return true violet
		} else{
			return false
		}
	}
 
  
}