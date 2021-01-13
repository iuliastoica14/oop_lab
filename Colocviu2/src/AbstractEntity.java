abstract class AbstractEntity {
    private long id;

    AbstractEntity(long id)
    {
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
