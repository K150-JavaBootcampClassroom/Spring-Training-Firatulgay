package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.strategies;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Customer;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Person;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.enums.RentType;

public class HatchBackStrategyImpl implements IRentStrategy {
    @Override
    public void rentaCar(Car car, Customer customer) {

        double hathBackMounthlyParam = 1.1;

        if (customer instanceof Person){
            System.out.println("you re not allowed for this operation!!");
        }else {
            if (RentType.MOUNTHLY.equals(car.getRentInfo().getRentType())){
   //             RentInfo rentInfo = new RentInfo();
     //           double mouthlyPrice = hathBackMounthlyParam * car.getRentInfo().getMounthlyRentPrice();
       //         rentInfo.setTotalPrice(mouthlyPrice);
            }
        }
        System.out.println("Hatchback Kiralama");
    }
}
