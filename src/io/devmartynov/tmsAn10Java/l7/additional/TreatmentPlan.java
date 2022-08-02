package io.devmartynov.tmsAn10Java.l7.additional;

/**
 * TreatmentPlan.
 */
public class TreatmentPlan {
    private TreatmentPlanCodeEnum code;

    /**
     * Ctor.
     *
     * @param code code
     */
    public TreatmentPlan(TreatmentPlanCodeEnum code) {
        this.code = code;
    }

    /**
     * Code
     *
     * @return code
     */
    public TreatmentPlanCodeEnum getCode() {
        return code;
    }
}
