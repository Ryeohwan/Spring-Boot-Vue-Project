<template>
  <div>
    <div>
      <b-row>
        <b-col>
          <h1 class="m-t-1 mb-5 fw-semi-bold">나의 정보</h1>
          <h5 class="m-t-1">ID:</h5>
          <pre class="mb-4"><code class="h5">{{ userInfo.userid }}</code></pre>
          <h5 class="m-t-1">Name:</h5>
          <pre
            class="mb-4"
          ><code class="h5">{{ userInfo.username }}</code></pre>
          <h5 class="m-t-1">E-mail:</h5>
          <pre class="mb-4"><code class="h5">{{ userInfo.email }}</code></pre>
          <h5 class="m-t-1">Join Date:</h5>
          <pre
            class="mb-4"
          ><code class="h5">{{ userInfo.joindate }}</code></pre>
          <h5 class="m-t-1">Tel:</h5>
          <pre class="mb-4"><code class="h5">{{ userInfo.number }}</code></pre>

          <p>
            Different types of notifications for lots of use cases. Custom
            classes are also supported.
          </p>
          <p>
            <b-button variant="info" id="show-info-message" @click="modify"
              >정보 수정</b-button
            >
          </p>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
//<style src="./Notifications.scss" lang="scss" scoped />
import { mapState } from "vuex";
import Widget from "@/components/Widget/Widget";

const memberStore = "memberStore";

export default {
  name: "UserMyPage",
  components: {
    Widget,
  },
  computed: {
    ...mapState(memberStore, ["userInfo"]),
  },
  methods: {
    modify() {
      this.$router.push({ name: "modify" });
    },
  },
};
</script>

<style></style>

