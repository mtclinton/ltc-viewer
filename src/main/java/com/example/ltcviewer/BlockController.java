package com.example.ltcviewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BlockController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/blocks")
    public Block[] blocks() {
        NetworkInfo info = restTemplate.getForObject("https://chain.so/api/v2/get_info/LTC", NetworkInfo.class);

        Integer blockCount = info.getData().getBlocks();
        Block[] blocks = new Block[5];

        for (int i = 0; blockCount - i > (blockCount - 5); ++i) {
            blocks[i] = restTemplate.getForObject(
                "https://chain.so/api/v2/get_block/DOGE/" + (blockCount - i),
                Block.class
            );
        }

        return blocks;
    }

}