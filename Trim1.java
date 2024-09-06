
    /**
     * Project: Lab1 Motorcycle
     * Purpose Details: Represents trim details such as seat type and accessories.
     * Course: IST 242
     * Author: Your Name
     * Date Developed: 09/05/2024
     * Last Date Changed:
     * Revision:
     */
    public class Trim1 {
        // Fields (attributes) of the Trim class
        private String seatType; // Example: "Leather", "Vinyl"
        private String paintJob;  // Example: "Matte Black", "Glossy Red"
        private boolean hasAccessories; // Example: true if extra accessories are added

        // Constructor to initialize a Trim object
        public Trim1 (String seatType, String paintJob, boolean hasAccessories) {
            this.seatType = seatType;
            this.paintJob = paintJob;
            this.hasAccessories = hasAccessories;
        }

        // Getter for 'seatType'
        public String getSeatType() {
            return seatType;
        }

        // Setter for 'seatType'
        public void setSeatType(String seatType) {
            this.seatType = seatType;
        }

        // Getter for 'paintJob'
        public String getPaintJob() {
            return paintJob;
        }

        // Setter for 'paintJob'
        public void setPaintJob(String paintJob) {
            this.paintJob = paintJob;
        }

        // Getter for 'hasAccessories'
        public boolean hasAccessories() {
            return hasAccessories;
        }

        // Setter for 'hasAccessories'
        public void setHasAccessories(boolean hasAccessories) {
            this.hasAccessories = hasAccessories;
        }
    }



