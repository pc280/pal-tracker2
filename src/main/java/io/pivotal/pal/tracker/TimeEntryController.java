package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.TimeEntry;
import io.pivotal.pal.tracker.TimeEntryRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

    }

    public ResponseEntity<Void> delete(long timeEntryId) {
        return null;
    }

    public ResponseEntity<TimeEntry> update(long nonExistentTimeEntryId, TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(long nonExistentTimeEntryId) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }
}
