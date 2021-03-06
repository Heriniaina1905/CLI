package tv.nosy.cli.models.services;

import java.util.List;

import tv.nosy.cli.models.dao.Admin;
import tv.nosy.cli.models.dao.Cd;
import tv.nosy.cli.models.dao.HL;

public interface HLDAO {
    public void addHL(HL hl);
    public void addHL(Admin a, Cd c);
    public void remove(HL hl);
    public HL getHLByAdmin(long ref);
    public HL getHLByCd(long ref);
    public List<HL> getAllHL();
}
