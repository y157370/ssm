package top.top234.ssm.service.imp;

import org.springframework.stereotype.Service;
import top.top234.ssm.service.SomeService;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/17 12:12.
 *
 * ********************************
 *
 * @author top234
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("do some...");
    }
}
