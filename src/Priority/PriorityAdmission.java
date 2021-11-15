package Priority;

import person.Patient;

/**
 * A subclass of the Priority PriorityQueue that determines the order in which patients are admitted.
 *
 * @author Shysta and Justice
 * @version 2.0
 * @since 1.0
 */

public class PriorityAdmission extends Priority {
    public PriorityAdmission() {
        super();
    }

    /**
     * Orders patients by who has the lowest HP and, in the case of a tie, the patient who has insurance is
     * prioritised.
     *
     * @param patient    A patient currently in the PriorityQueue.
     * @param newPatient A new patient to be added to the PriorityQueue.
     * @return true if patient has higher health than newPatient, false if not.
     */
    public boolean higherPriority(Patient patient, Patient newPatient) {
        if (patient.getHealth() == newPatient.getHealth()) {
            return !patient.getInsurance() & newPatient.getInsurance();
        }
        return patient.getHealth() > newPatient.getHealth();
    }

}