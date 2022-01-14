// Fetch last 5 blocks
fetch('/blocks')
    .then(res => res.json())
    .then(renderBlocks);

function renderBlocks(blocks) {
    for (block of blocks) {
        let el = document.createElement('tr');

        let blockNumber = document.createElement('td');
        blockNumber.innerText = block.data.block_no;

        let blockHash = document.createElement('td');
        blockHash.innerText = block.data.blockhash;

        let miningDifficulty = document.createElement('td');
        miningDifficulty.innerText = block.data.mining_difficulty;

        let confirmations = document.createElement('td');
        confirmations.innerText = block.data.confirmations;

        el.appendChild(blockNumber);
        el.appendChild(blockHash);
        el.appendChild(miningDifficulty);
        el.appendChild(confirmations);

        document.getElementById('blocks').appendChild(el);
        document.getElementById('loader').style.display = 'none';
    }
}
