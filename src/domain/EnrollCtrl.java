package domain;

import java.util.List;
import java.util.Map;

import domain.exceptions.EnrollmentRulesViolationException;

public void checkNotPassed(Map<Term, Map<Course, Double>> transcript, CSE o, Course pre) throw
	for (Map.Entry<Term, Map<Course, Double>> tr : transcript.entrySet()) {
		for (Map.Entry<Course, Double> r : tr.getValue().entrySet()) {
			if (r.getKey().equals(pre) && r.getValue() >= 10)
				return;
		}
	}
    throw new EnrollmentRulesViolationException(String.Format("Student has not passed %s yet.")
}

private void checkPassed(Map<Term, Map<Course, Double>> transcript, CSE o)
	throws EnrollmentRulesViolationException {
		for(Map.Entry<Term, Map<Course, Double>> tr : transcript.entrySet()){
			for (Map.Entry<Course, Double> r : tr.getValue().entrySet()) {
				if (r.getKey().equals(o.getCourse()) && r.getValue() >= 10)
					throw new EnrollmentRulesViolationException(String.format("Student has already passed %s.")
			}
    
		}
	}
}
