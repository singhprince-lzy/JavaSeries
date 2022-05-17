package lambdaExp;

import java.util.*;

@FunctionalInterface
public interface TicketCollection {
	double totalCollection(List<TicketingData> ticketingDataList);
}
