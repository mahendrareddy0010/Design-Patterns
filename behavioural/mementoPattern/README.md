1. Game development
2. Snapshotting
3. Incremental snapshotting like Database log, RAFT (consesus algorithm) log.
4. undo operations
5. transaction rollback but it is very difficult to do it because in naive approach you need to save whole database state
    `Eg:` Postgress snapshotting isolation