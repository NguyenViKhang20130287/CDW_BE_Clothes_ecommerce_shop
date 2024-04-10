package vn.edu.hcmuaf.api_clothes_ecommerce_shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.hcmuaf.api_clothes_ecommerce_shop.Entity.Size;

public interface SizeRepository extends JpaRepository<Size, Long> {
    Size findByName(String name);
}
