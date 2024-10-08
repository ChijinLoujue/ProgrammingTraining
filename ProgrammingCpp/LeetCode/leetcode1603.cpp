//
// Created by ChijinLoujue on 2021/3/21.
//

class ParkingSystem {
public:
    int big = 0;
    int medium = 0;
    int small = 0;
    ParkingSystem(int big, int medium, int small) {
        this->big=big;
        this->medium=medium;
        this->small=small;
    }

    bool addCar(int carType) {
        if(carType == 1){
            if(this->big==0){
                return false;
            } else{
                this->big--;
                return true;
            }
        }
        if(carType == 2){
            if(this->medium==0){
                return false;
            } else{
                this->medium--;
                return true;
            }
        }
        if(carType == 3){
            if(this->small==0){
                return false;
            } else{
                this->small--;
                return true;
            }
        }
        return false;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */