package de.hybris.training.core.actions.quote;

import de.hybris.platform.core.GenericSearchConstants;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.training.core.model.TestProcessModel;
import org.apache.log4j.Logger;

public class TestAction extends AbstractSimpleDecisionAction<TestProcessModel> {
    private static final Logger LOG = Logger.getLogger(TestAction.class);
    @Override
    public Transition executeAction(TestProcessModel testProcessModel) throws RetryLaterException, Exception {
        LOG.info("Tested!!!");
        return Transition.OK;
    }
}
