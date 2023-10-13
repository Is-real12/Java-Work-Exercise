public class AutomaticBike {


        private boolean isOn;
        private int speed;
        private int gear;

        public AutomaticBike() {
            this.isOn = false;
            this.speed = 0;
            this.gear = 1;
        }


        public boolean getIsOn() {
            return isOn;
        }

        public int getSpeed() {
            return speed;
        }

        public int getGear() {
            return gear;
        }


        public void turnOn() {
            isOn = true;

        }

        public void turnOff() {
            isOn = false;

        }

        public void accelerate() {
            if (isOn) {
                if (gear == 1) {
                    speed += 1;
                } else if (gear == 2) {
                    speed += 2;
                } else if (gear == 3) {
                    speed += 3;
                } else if (gear == 4) {
                    speed += 4;
                }

            }
        }

        public void decelerate() {
            if (isOn) {
                if (gear == 1) {
                    speed = (speed - 1);
                } else if (gear == 2) {
                    speed = (speed - 2);
                } else if (gear == 3) {
                    speed = (speed - 3);
                } else if (gear == 4) {
                    speed = ( speed - 4);
                }


            }
        }

        private void adjustGear() {
            if (speed <= 20) {
                gear = 1;
            } else if (speed <= 30) {
                gear = 2;
            } else if (speed <= 40) {
                gear = 3;
            } else {
                gear = 4;
            }
        }
    }



