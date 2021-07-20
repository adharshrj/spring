@RestController
public class MyApiController extends BaseController{
    @Autowired
    private CustomerManager service;

    @GetMapping(value = "/names")
}