package comeng.sa.no12.demo;

import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import comeng.sa.no12.demo.controller.*;

import java.util.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {

    private final StaffRepository staffRepository;
    private final CustomerRepository customerRepository;
    private final DeliveryRepository deliveryRepository;
    private final InitialRepository initialRepository;
    private final OrdersRepository ordersRepository;

    private final Bill_of_ladingRepository bill_of_ladingRepository;
    private final TypeItemRepository typeItemRepository;
    private final ItemRepository itemRepository;
    private final ListItemRepository listItemRepository;
    private final ProvinceRepository provinceRepository;
    private final GenderRepository genderRepository;
    private final DetailsRepository detailsRepository;
    private final PostedRepository postedRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public DatabaseLoader(StaffRepository staffRepository, CustomerRepository customerRepository,
            DeliveryRepository deliveryRepository, InitialRepository initialRepository,
            OrdersRepository ordersRepository, Bill_of_ladingRepository bill_of_ladingRepository,
            TypeItemRepository typeItemRepository, ItemRepository itemRepository, ListItemRepository listItemRepository,
            ProvinceRepository provinceRepository, GenderRepository genderRepository,
            DetailsRepository detailsRepository, PostedRepository postedRepository,
            CategoryRepository categoryRepository) {
        this.staffRepository = staffRepository;
        this.customerRepository = customerRepository;
        this.initialRepository = initialRepository;
        this.deliveryRepository = deliveryRepository;
        this.ordersRepository = ordersRepository;
        this.bill_of_ladingRepository = bill_of_ladingRepository;
        this.typeItemRepository = typeItemRepository;
        this.itemRepository = itemRepository;

        this.listItemRepository = listItemRepository;
        this.provinceRepository = provinceRepository;
        this.genderRepository = genderRepository;
        this.detailsRepository = detailsRepository;
        this.postedRepository = postedRepository;
        this.categoryRepository = categoryRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Gender g1 = new Gender();
        g1.setSex("None");
        genderRepository.save(g1);
        Gender g2 = new Gender();
        g2.setSex("Male");
        genderRepository.save(g2);
        Gender g3 = new Gender();
        g3.setSex("Female");
        genderRepository.save(g3);
        Gender g4 = new Gender();
        g4.setSex("Tom");
        genderRepository.save(g4);
        Gender g5 = new Gender();
        g5.setSex("Gay");
        genderRepository.save(g5);


        Initial init1 = new Initial();
        init1.setInitialName("Mr.");
        initialRepository.save(init1);
        Initial init2 = new Initial();
        init2.setInitialName("Mrs.");
        initialRepository.save(init2);
        Initial init3 = new Initial();
        init3.setInitialName("Miss");
        initialRepository.save(init3);

        Province pro1 = new Province();
        pro1.setProvinceName("กรุงเทพมหานคร");
        provinceRepository.save(pro1);
       
        Province pro2 = new Province();
        pro2.setProvinceName("กาญจนบุรี");
        provinceRepository.save(pro2);

        Province pro3 = new Province();
        pro3.setProvinceName("ขอนแก่น");
        provinceRepository.save(pro3);

        Province pro4 = new Province();
        pro4.setProvinceName("จันทบุรี");
        provinceRepository.save(pro4);

        Province pro5 = new Province();
        pro5.setProvinceName("ชลบุรี");
        provinceRepository.save(pro5);

        Province pro6 = new Province();
        pro6.setProvinceName("ชัยภูมิ");
        provinceRepository.save(pro6);

        Province pro7 = new Province();
        pro7.setProvinceName("เชียงราย");
        provinceRepository.save(pro7);

        Province pro8 = new Province();
        pro8.setProvinceName("เชียงใหม่");
        provinceRepository.save(pro8);

        Province pro9 = new Province();
        pro9.setProvinceName("ตรัง");
        provinceRepository.save(pro9);

        Province pro10 = new Province();
        pro10.setProvinceName("ตาก");
        provinceRepository.save(pro10);

        Province pro11 = new Province();
        pro11.setProvinceName("นครนายก");
        provinceRepository.save(pro11);

        Province pro12 = new Province();
        pro12.setProvinceName("นครพนม");
        provinceRepository.save(pro12);

        Province pro13 = new Province();
        pro13.setProvinceName("นครราชสีมา");
        provinceRepository.save(pro13);

        Province pro14 = new Province();
        pro14.setProvinceName("นครศรีธรรมราช");
        provinceRepository.save(pro14);

        Province pro15 = new Province();
        pro15.setProvinceName("บึงกาฬ");
        provinceRepository.save(pro15);

        Province pro16 = new Province();
        pro16.setProvinceName("บุรีรัมย์");
        provinceRepository.save(pro16);

        Province pro17 = new Province();
        pro17.setProvinceName("ประจวบคีรีขันธ์ ");
        provinceRepository.save(pro17);

        Province pro18 = new Province();
        pro18.setProvinceName("ปราจีนบุรี");
        provinceRepository.save(pro18);

        Province pro19 = new Province();
        pro19.setProvinceName("พังงา");
        provinceRepository.save(pro19);

        Province pro20 = new Province();
        pro20.setProvinceName("เพชรบุรี");
        provinceRepository.save(pro20);

        Province pro21 = new Province();
        pro21.setProvinceName("เพชรบูรณ์");
        provinceRepository.save(pro21);

        Province pro22 = new Province();
        pro22.setProvinceName("ภูเก็ต");
        provinceRepository.save(pro22);
        
        Province pro23 = new Province();
        pro23.setProvinceName("มหาสารคาม");
        provinceRepository.save(pro23);

        Province pro24 = new Province();
        pro24.setProvinceName("แม่ฮ่องสอน");
        provinceRepository.save(pro24);

        Province pro25 = new Province();
        pro25.setProvinceName("ราชบุรี");
        provinceRepository.save(pro25);

        Province pro26 = new Province();
        pro26.setProvinceName("ลำปาง");
        provinceRepository.save(pro26);

        Province pro27 = new Province();
        pro27.setProvinceName("เลย ");
        provinceRepository.save(pro27);

        Province pro28 = new Province();
        pro28.setProvinceName("สงขลา");
        provinceRepository.save(pro28);

        Province pro29 = new Province();
        pro29.setProvinceName("หนองคาย");
        provinceRepository.save(pro29);

        Province pro30 = new Province();
        pro1.setProvinceName("อุบลราชธานี");
        provinceRepository.save(pro30);


        Customer cus1 = new Customer();
        cus1.setInitial(init2);
        cus1.setCustomerName("Tuntika Chinklang");
        cus1.setGender(g2);
        cus1.setCustomerAddress("515 หมู่1 ต.สุรนารี อ.เมือง 30000");
        cus1.setProvince(pro25);
        cus1.setCustomerEmail("tuntika@hotmail.com");
        cus1.setCustomerPhone("0651234569");
        cus1.setCustomerUserID("tuntika");
        cus1.setCustomerPassword("1234");
        customerRepository.save(cus1);

        Customer cus2 = new Customer();
        cus2.setInitial(init2);
        cus2.setCustomerName("Piyawadee Yooprayong");
        cus2.setGender(g5);
        cus2.setCustomerAddress("616 หมู่1 ต.สุรนารี อ.เมือง 30000");
        cus2.setProvince(pro12);
        cus2.setCustomerEmail("piyawadee@hotmail.com");
        cus2.setCustomerPhone("0643501488");
        cus2.setCustomerUserID("piyawadee");
        cus2.setCustomerPassword("5678");
        customerRepository.save(cus2);

        Customer cus3 = new Customer();
        cus3.setInitial(init3);
        cus3.setCustomerName("tada mame");
        cus3.setGender(g1);
        cus3.setCustomerAddress("717 หมู่1 ต.สุรนารี อ.เมือง 30000");
        cus3.setProvince(pro5);
        cus3.setCustomerEmail("tada@hotmail.com");
        cus3.setCustomerPhone("0612046507");
        cus3.setCustomerUserID("tada");
        cus3.setCustomerPassword("7890");
        customerRepository.save(cus3);

        
        
        Customer c1 = this.customerRepository.findByCustomerId(1L);
        Customer c2 = this.customerRepository.findByCustomerId(2L);
        Customer c3 = this.customerRepository.findByCustomerId(3L);

        this.typeItemRepository.save(new TypeItem("Export"));
        this.typeItemRepository.save(new TypeItem("Import"));
        this.typeItemRepository.save(new TypeItem("Avaiaible"));

        TypeItem t1 = this.typeItemRepository.findByTypeId(1L);
        TypeItem t2 = this.typeItemRepository.findByTypeId(2L);
        TypeItem t3 = this.typeItemRepository.findByTypeId(3L);

        this.detailsRepository.save(new Details("kao", 20, "Khong", "BLACK"));
        this.detailsRepository.save(new Details("koa", 20, "Khong", "RED"));
        this.detailsRepository.save(new Details("oka", 20, "Khong", "YELLO"));
        Details d1 = this.detailsRepository.findByDetailsId(1L);
        Details d2 = this.detailsRepository.findByDetailsId(2L);
        Details d3 = this.detailsRepository.findByDetailsId(3L);

        this.itemRepository.save(new Item("Coke", 15.0, 1,"CaPeEnd"));
        this.itemRepository.save(new Item("joke", 15.0, 3, "CaPeEnd"));
        this.itemRepository.save(new Item("Water", 15.0, 1, "CaPeEnd"));
        Item i1 = this.itemRepository.findByItemId(1L);
        Item i2 = this.itemRepository.findByItemId(2L);
        Item i3 = this.itemRepository.findByItemId(3L);

        this.listItemRepository.save(new ListItem(i1));
        this.listItemRepository.save(new ListItem(i2));
        this.listItemRepository.save(new ListItem(i3));
        ListItem li1 = this.listItemRepository.findByListItemId(1L);
        ListItem li2 = this.listItemRepository.findByListItemId(2L);
        ListItem li3 = this.listItemRepository.findByListItemId(3L);
        

        this.staffRepository.save(new Staff("John", "0935479424", "B5814823", "Suranaree", "7313"));
        this.staffRepository.save(new Staff("jao", "0935479424", "B5814824", "Suranaree1", "73134"));
        this.staffRepository.save(new Staff("kmo", "085209766", "B5814825", "Suranaree2", "73135"));
        Staff s1 = this.staffRepository.findByStaffId(1L);
        Staff s2 = this.staffRepository.findByStaffId(2L);
        Staff s3 = this.staffRepository.findByStaffId(3L);

        this.bill_of_ladingRepository.save(new Bill_of_lading(s1, i1, t1));
        this.bill_of_ladingRepository.save(new Bill_of_lading(s2, i2, t2));
        this.bill_of_ladingRepository.save(new Bill_of_lading(s3, i3, t3));


        this.ordersRepository.save(new Orders(c1,li1,new Date(2018-10-10)));
        this.ordersRepository.save(new Orders(c2,li2,new Date(2018-10-10)));
        this.ordersRepository.save(new Orders(c3,li3,new Date(2018-10-10)));
        Orders o1 =  this.ordersRepository.findByOrderId(1L);
        Orders o2 =  this.ordersRepository.findByOrderId(2L);
        Orders o3 =  this.ordersRepository.findByOrderId(3L);

        this.categoryRepository.save(new Category("Khong new"));
        this.categoryRepository.save(new Category("Khong kao"));
        this.categoryRepository.save(new Category("Khong Avaiaible"));
        Category cat1 = this.categoryRepository.findByCategoryId(1L);
        Category cat2 = this.categoryRepository.findByCategoryId(2L);
        Category cat3 = this.categoryRepository.findByCategoryId(3L);

        this.postedRepository.save(new Posted(d1,cat1,cus1));
        this.postedRepository.save(new Posted(d2,cat3,cus2));
        this.postedRepository.save(new Posted(d3,cat3,cus3));

        Posted po1 =    this.postedRepository.findByPostedId(1L);
        Posted po2 =    this.postedRepository.findByPostedId(2L);
        Posted po3 =    this.postedRepository.findByPostedId(3L);
        

        this.deliveryRepository.save(new Delivery(s1,o1,new Date(),"AAA"));
        this.deliveryRepository.save(new Delivery(s2,o2,new Date(),"CCC"));
        this.deliveryRepository.save(new Delivery(s3,o3,new Date(),"BBB"));

        /*
         * this.customerAddressRepository.save(new CustomerAddress("Surnaree",
         * "suraswad", "suraswd2", "korth", 30000)); this.customerAddressRepository
         * .save(new CustomerAddress("Surnaree2", "suraswad2", "suraswd3", "korth2",
         * 300000)); this.customerAddressRepositorcat3 CustomerAddress("Surnare4",
         * "suraswad3", "suraswd4", "korth3", 3000000)); CustomerAddress ca1 =
         * this.customerAddressRepository.findByAddressId(1L); CustomerAddress ca2 =
         * this.customerAddressRepository.findByAddressId(2L); CustomerAddress ca3 =
         * this.customerAddressRepository.findByAddressId(3L);
         * 
         * this.deliveryRepository.save(new Delivery(new Date(2020 - 11 - 15),
         * "KK191911")); this.deliveryRepository.save(new Delivery(new Date(2021 - 11 -
         * 15), "BBewfa2")); this.deliveryRepository.save(new Delivery(new Date(2022 -
         * 11 - 15), "AAewfa122")); Delivery de1 =
         * this.deliveryRepository.findByDeliveryId(1L); Delivery de2 =
         * this.deliveryRepository.findByDeliveryId(2L); Delivery de3 =
         * this.deliveryRepository.findByDeliveryId(3L);
         */

        // Item i1 = this.itemRepository.findByItemId(1L);

        // no ListItem

        /*
         * this.ordersRepository.save(new Orders("jxx", new Date(2016 - 15 - 9)));
         * this.ordersRepository.save(new Orders("jxx", new Date(2015 - 13 - 6)));
         * this.ordersRepository.save(new Orders("jxx", new Date(2014 - 16 - 2)));
         * Orders o1 = this.ordersRepository.findByOrderId(1L); Orders o2 =
         * this.ordersRepository.findByOrderId(2L); Orders o3 =
         * this.ordersRepository.findByOrderId(3L);
         */

        /*
         * this.customerRepository.save(new Customer("John", 20L, "0935479424",
         * "hotmail")); this.customerRepository.save(new Customer("jam", 20L,
         * "0919001242", "gmail")); this.customerRepository.save(new Customer("Frame",
         * 20L, "0935479424", "hotmail"));
         * 
         * Customer c1 = this.customerRepository.findByCustomerId(1L); Customer c2 =
         * this.customerRepository.findByCustomerId(2L); Customer c3 =
         * this.customerRepository.findByCustomerId(3L);
         */

        // this.bill_of_ladingRepository.save(new Bill_of_lading(s1,i1,t1));
        // this.bill_of_ladingRepository.save(new Bill_of_lading(s2,i2,t2));
        // this.bill_of_ladingRepository.save(new Bill_of_lading(s3,i3,t3));

    }
}